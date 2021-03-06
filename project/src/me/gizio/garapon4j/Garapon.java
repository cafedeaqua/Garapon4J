package me.gizio.garapon4j;

import java.util.ArrayList;
import java.util.Map;

import me.gizio.garapon4j.GaraponImpl.SearchBuilder;
import me.gizio.garapon4j.json.Program;

public interface Garapon {

	/**
	 * 
	 * @param user
	 * @param password
	 * @param dev_id
	 * @return IP Address
	 */
	public String initialize(String user, String md5Password, String dev_id);

	public String initializeByPlainPassword(String user, String password,
			String dev_id);
	
	
	public ArrayList<Program> search();
	
	public ArrayList<Program> search(Map<String, String> map);

	public SearchBuilder getSearchBuilder();
	
	public boolean favorite(String gtvid, String rank);

	public String channel();

}
