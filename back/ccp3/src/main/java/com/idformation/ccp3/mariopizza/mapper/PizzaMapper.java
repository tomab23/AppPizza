package com.idformation.ccp3.mariopizza.mapper;

import java.util.ArrayList;
import java.util.List;

import com.idformation.ccp3.mariopizza.dto.PizzaDTO;
import com.idformation.ccp3.mariopizza.models.Pizza;

/**
 * @author Stagiaire
 *
 */
public class PizzaMapper {

	/**
	 * Transform Pizza Entity to PizzaDTO.
	 * @param piz Pizza entity
	 * @return dto Pizza to PizzaDTO
	 */
	public static PizzaDTO toDto(final Pizza piz) {
		PizzaDTO dto = null;

		if (piz != null) {
			dto = new PizzaDTO();
			dto.setId(piz.getId());
			dto.setName(piz.getName());
			dto.setImage(piz.getImage());
			dto.setDescription(piz.getDescription());
			dto.setPrice(piz.getPrice());
		}

		return dto;
	}

	/**
	 * Transform PizzaDTO to Pizza Entity.
	 * @param dto PizzaDTO
	 * @return piz Pizza entity
	 */
	public static Pizza toEntity(final PizzaDTO dto) {
		Pizza piz = null;

		if (dto != null) {
			piz = new Pizza();
			piz.setId(dto.getId());
			piz.setName(dto.getName());
			piz.setImage(dto.getImage());
			piz.setDescription(dto.getDescription());
			piz.setPrice(dto.getPrice());

		}
		return piz;
	}

	/**
	 * Transform List of Pizza Entity to List of PizzaDTO.
	 * @param pizs List of Pizza
	 * @return dtos List of PizzaDTO
	 */
	public static List<PizzaDTO> listToListDto(final List<Pizza> pizs) {
		List<PizzaDTO> dtos = null;

		if (pizs != null && !pizs.isEmpty()) {
			dtos = new ArrayList<>();

			for (Pizza p : pizs) {
				dtos.add(toDto(p));
			}
		}

		return dtos;
	}

}
