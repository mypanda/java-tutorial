package dao;

public class AnimalDaoImpl implements AnimalDao {

	@Override
	public void say(String word) {
		System.out.println("dao say " + word);
	}

}
