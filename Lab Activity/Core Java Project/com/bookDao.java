package com;
import java.io.IOException;

public interface bookDao {
	
	public void createBook() throws IOException;
	public void readBook() throws IOException;
	public void updateBook() throws IOException;
	public void deleteBook() throws IOException;

}