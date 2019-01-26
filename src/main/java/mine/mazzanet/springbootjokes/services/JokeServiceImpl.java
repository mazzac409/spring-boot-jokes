package mine.mazzanet.springbootjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by chrismazza on 2019-01-25
 **/

@Service
public class JokeServiceImpl implements JokeService {

    //private final ChuckNorrisQuotes chuckNorrisQuotes;
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
