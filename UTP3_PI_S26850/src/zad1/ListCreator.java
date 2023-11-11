package zad1;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListCreator<T> {
    private List<T> list;
    public ListCreator(List<T> list) {
        this.list = list;
    }

    public static <T> ListCreator<T> collectFrom(List<T> destinations) {
        return new ListCreator<>(destinations);
    }

    public ListCreator<T> when(Predicate<T> predicate) {
        this.list = this.list.stream().filter(predicate).collect(Collectors.toList());
        return this;
    }

    public <R> List<R> mapEvery(Function<T, R> function) {
        return this.list.stream().map(function).collect(Collectors.toList());
    }
}
