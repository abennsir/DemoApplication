package com.hatem.noureddine.carrefour.demo;

import com.hatem.noureddine.carrefour.demo.network.data.Movie;

import java.util.List;

/**
 * Created by Hatem Noureddine on 23/11/2017.
 *
 * @version 1.0
 */

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<Movie> items);

    void showMessage(String message);
}
