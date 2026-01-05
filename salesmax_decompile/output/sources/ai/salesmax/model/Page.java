package ai.salesmax.model;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import p001o.mic;
import p001o.nic;

/* loaded from: classes.dex */
public class Page<T> {
    private List<T> items;
    private Optional<String> nextPageToken;
    private int pageCapacity;

    public Page(List<T> list, Optional<String> optional, int i) {
        this.items = list;
        this.nextPageToken = optional;
        this.pageCapacity = i;
    }

    public static <T> Page<T> emptyPage() {
        return new Page<>(Collections.emptyList(), Optional.empty(), 0);
    }

    public void clear() {
        Optional.ofNullable(this.items).ifPresent(new mic());
        this.items = null;
        this.nextPageToken = null;
    }

    public List<T> getItems() {
        return this.items;
    }

    public Optional<String> getNextPageToken() {
        return this.nextPageToken;
    }

    public Boolean isEmpty() {
        return Boolean.valueOf(((Boolean) Optional.ofNullable(this.items).map(new nic()).orElse(Boolean.TRUE)).booleanValue() && !this.nextPageToken.isPresent());
    }

    public boolean isPageFull() {
        return this.pageCapacity <= this.items.size();
    }
}
