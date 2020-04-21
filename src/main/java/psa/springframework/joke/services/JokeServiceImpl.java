/**
 * 
 */
package psa.springframework.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;



/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	

	/**
	 * @param chuckNorrisQuotes
	 */
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}





	@Override
	public String getJokes() {
		// TODO Auto-generated method stub
		
		return chuckNorrisQuotes.getRandomQuote();
	}

}
