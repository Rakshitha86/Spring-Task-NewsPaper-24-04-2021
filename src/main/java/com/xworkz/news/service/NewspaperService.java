package com.xworkz.news.service;

import com.xworkz.news.dto.NewspaperDTO;

public interface NewspaperService {
	
	 boolean saveAndValidate(NewspaperDTO dto);
}
