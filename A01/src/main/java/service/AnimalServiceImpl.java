package service;

import dao.AnimalDao;;

public class AnimalServiceImpl implements AnimalService {
	
	private AnimalDao animalDao;
	
	public void setAnimalDao(AnimalDao animalDao) {
		this.animalDao = animalDao;
	}

	@Override
	public void say(String word) {
		System.out.println("service say" + word);
		animalDao.say(word);
	}

}
