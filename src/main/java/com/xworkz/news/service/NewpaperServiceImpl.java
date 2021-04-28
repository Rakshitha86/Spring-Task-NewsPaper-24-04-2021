package com.xworkz.news.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.news.dao.NewspaperDAO;
import com.xworkz.news.dto.NewspaperDTO;
import com.xworkz.news.entity.NewspaperEntity;

@Component
public class NewpaperServiceImpl implements NewspaperService {

	@Autowired
	private NewspaperDAO dao;

	public static Map<String, String> map = new HashMap<String, String>();

	public NewpaperServiceImpl() {
		super();
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@Override
	public boolean saveAndValidate(NewspaperDTO dto) {
//		if(Objects.nonNull(dto)) {
//			NewspaperEntity entity = new NewspaperEntity();
//		BeanUtils.copyProperties(dto, entity);
//		return this.dao.saveNewspaper(entity);
//	}

		// or

		boolean validData = false;
		if (dto != null) {
			System.out.println("dto is not null, can validate");

			String name = dto.getName();
			if (name != null && !name.isEmpty() && !name.contentEquals(" ")) {
				System.out.println("name is valid");
				validData = true;
			} else {
				System.out.println("name is not valid");
				map.put("Name", "Enter valid name");
				validData = false;
			}
			if (validData) {
				double cost = dto.getCost();
				if (cost > 0 && cost != 0) {
					System.out.println("cost is valid");
					validData = true;
				} else {
					System.out.println("cost is not valid");
					map.put("Cost", "Enter valid cost");
					validData = false;
				}
		}

			if (validData) {
				int noOfPages = dto.getNoOfPages();
				if (noOfPages > 1 && noOfPages != 0) {
					System.out.println("noOfPages is valid");
					validData = true;
				} else {
					System.out.println("noOfPages is not valid");
					map.put("NoOfPages", "Enter valid no of pages");
					validData = false;
				}
			}
			if (validData) {
				String language = dto.getLanguage();
				if (language != null && !language.isEmpty() && !language.contentEquals(" ")) {
					System.out.println("language is valid");
					validData = true;
				} else {
					System.out.println("language is not valid");
					map.put("Language", "Enter valid language");
					validData = false;
				}
			}

			if (validData) {
				boolean magazine = dto.isMagazine();
				if (Objects.nonNull(magazine)) {
					System.out.println("magazine is valid");
					validData = true;
				} else {
					System.out.println("magazine is not valid");
					map.put("Magazine", "Enter valid magazine");
					validData = false;
				}

			}
			if (validData) {
				System.out.println("Invoke save method, data is valid");
				if(Objects.nonNull(dto)) {
				NewspaperEntity entity = new NewspaperEntity();
				BeanUtils.copyProperties(dto, entity);
				return this.dao.saveNewspaper(entity);
			}else {
				return false;
			}
			} else {
				System.out.println("dto is null, invalid data");
			}
		}
		return true;

	}

}
