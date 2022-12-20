/**
 *  Pizza test
 */
package com.idformation.ccp3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.idformation.ccp3.mariopizza.dto.PizzaDTO;
import com.idformation.ccp3.mariopizza.helpers.MagicNumber;
import com.idformation.ccp3.mariopizza.mapper.PizzaMapper;
import com.idformation.ccp3.mariopizza.models.Pizza;

/**
 * @author Stagiaire
 *
 */
@SpringBootTest
public class PizzaTest {

/**
	 * test for Pizza constructor.
	 */
	@Test
	void pizzaConstructor() {
		// given

		// when
		Object m = new PizzaMapper();

		// then
		assertEquals(m.getClass(), PizzaMapper.class);
	}

	/**
	 * test for Pizza entity to PizzaDTO.
	 */
	@Test
	public void pizzaToDto() {
		// given
		Pizza piz = new Pizza();

		piz.setId((long) 1);
		piz.setName("hawaienne");
		piz.setDescription("plein de choses");
		piz.setImage("image");
		piz.setPrice((double) MagicNumber.SIZESMALL);

		// when
		PizzaDTO dto = PizzaMapper.toDto(piz);

		// then
		assertThat(dto.getId()).isEqualTo(piz.getId());
		assertThat(dto.getName()).isEqualTo(piz.getName());
		assertThat(dto.getDescription()).isEqualTo(piz.getDescription());
		assertThat(dto.getImage()).isEqualTo(piz.getImage());
		assertThat(dto.getPrice()).isEqualTo(piz.getPrice());
	}

	/**
	 * test for PizzaDTO to Pizza entity.
	 */
	@Test
	public void pizzaDtoToEntity() {
		// given
		PizzaDTO dto = new PizzaDTO();

		dto.setId((long) 1);
		dto.setName("hawaienne");
		dto.setDescription("plein de choses");
		dto.setImage("image");
		dto.setPrice((double) MagicNumber.SIZESMALL);

		// when
		Pizza piz = PizzaMapper.toEntity(dto);

		// then
		assertThat(piz.getId()).isEqualTo(dto.getId());
		assertThat(piz.getName()).isEqualTo(dto.getName());
		assertThat(piz.getDescription()).isEqualTo(dto.getDescription());
		assertThat(piz.getImage()).isEqualTo(dto.getImage());
		assertThat(piz.getPrice()).isEqualTo(dto.getPrice());
	}

	/**
	 * test for PizzaDTO null to Pizza entity.
	 */
	@Test
	public void pizzaDtoNullToEntity() {
		// given
		PizzaDTO dto = null;


		// when
		Pizza pizza = PizzaMapper.toEntity(dto);

		// then
		assertThat(pizza).isNull();
	}

	/**
	 * test for Pizza entity null to PizzaDTO.
	 */
	@Test
	public void pizzaNullToPizzaDto() {
		// given
		Pizza pizza = null;


		// when
		PizzaDTO dto = PizzaMapper.toDto(pizza);

		// then
		assertThat(dto).isNull();
	}

	/**
	 * test for a List of Pizza entity null to List of PizzaDTO.
	 */
	@Test
	public void listPizzaNullToPizzaDto() {
		// given
		List<Pizza> pizs = null;

		// when
		List<PizzaDTO> dtos = PizzaMapper.listToListDto(pizs);

		// then
		assertThat(dtos).isNull();
	}

	/**
	 * test for a List of Pizza entity empty to List of PizzaDTO.
	 */
	@Test
	public void listPizzaEmptyToPizzaDto() {
		// given
		List<Pizza> pizs = new ArrayList<>();
		pizs.isEmpty();

		// when
		List<PizzaDTO> dtos = PizzaMapper.listToListDto(pizs);

		// then
		assertThat(dtos).isNull();
	}

	/**
	 * test for a List of Pizza entity to List of PizzaDTO.
	 */
	@Test
	public void listPizzatoListPizzaDto() {
		// given
		List<Pizza> pizs = new ArrayList<>();

		for (long i = 0; i < 2; i++) {
			pizs.add(new Pizza((long) 1, "hawaienne", "plein de choses", "image", (
					double) MagicNumber.SIZESMALL));
		}

		// when
		List<PizzaDTO> dtos = PizzaMapper.listToListDto(pizs);

		// then
		assertThat(dtos).isNotNull().hasSameSizeAs(pizs);
	}

}
