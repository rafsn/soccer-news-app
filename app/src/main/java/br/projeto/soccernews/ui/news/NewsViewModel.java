package br.projeto.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import br.projeto.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();


        //TODO Remover Mock de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária Tem Desfalque Importante", "is simply dummy text of the printing and typesetting industry."));
        news.add(new News("Ferrinha Joga no Sábado", "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin"));
        news.add(new News("Copa do Mundo Feminina Está Terminando", "It is a long established fact that a reader"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {

        return this.news;
    }
}