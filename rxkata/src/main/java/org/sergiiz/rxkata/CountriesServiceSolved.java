package org.sergiiz.rxkata;

import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.FutureTask;

class CountriesServiceSolved implements CountriesService {

    @Override
    public Single<String> countryNameInCapitals(Country country) {
        return Single.just(country.getName().toUpperCase(Locale.US));
    }

    @Override
    public Single<Integer> countCountries(List<Country> countries) {
        return Single.just(countries.size());
    }

    @Override
    public Observable<Long> listPopulationOfEachCountry(List<Country> countries) {
        return Observable.fromIterable(countries)
            .map(Country::getPopulation);
    }

    @Override
    public Observable<String> listNameOfEachCountry(List<Country> countries) {
        return Observable.fromIterable(countries)
            .map(Country::getName);
    }

    @Override
    public Observable<Country> listOnly3rdAnd4thCountry(List<Country> countries) {
        return Observable.fromIterable(countries)
            .skip(2)
            .take(2);
    }

    @Override
    public Single<Boolean> isAllCountriesPopulationMoreThanOneMillion(List<Country> countries) {
        return Observable.fromIterable(countries)
            .all(country -> country.getPopulation() > 1000000);
    }

    @Override
    public Observable<Country> listPopulationMoreThanOneMillion(List<Country> countries) {
        return Observable.fromIterable(countries)
            .filter(country -> country.getPopulation() > 1000000);
    }

    @Override
    public Observable<Country> listPopulationMoreThanOneMillionWithTimeoutFallbackToEmpty(final FutureTask<List<Country>> countriesFromNetwork) {
        return null; // put your solution here
    }

    @Override
    public Observable<String> getCurrencyUsdIfNotFound(String countryName, List<Country> countries) {
        return null; // put your solution here
    }

    @Override
    public Observable<Long> sumPopulationOfCountries(List<Country> countries) {
        return null; // put your solution here
    }

    @Override
    public Single<Map<String, Long>> mapCountriesToNamePopulation(List<Country> countries) {
        return null; // put your solution here
    }

    @Override
    public Observable<Long> sumPopulationOfCountries(Observable<Country> countryObservable1,
                                                     Observable<Country> countryObservable2) {
        return null; // put your solution here
    }

    @Override
    public Single<Boolean> areEmittingSameSequences(Observable<Country> countryObservable1,
                                                    Observable<Country> countryObservable2) {
        return null; // put your solution here
    }
}
