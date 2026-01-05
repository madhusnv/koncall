package ai.salesmax.model;

import com.google.android.gms.common.data.DataBufferUtils;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class SearchAPiResult {
    public static final int $stable = 8;
    private final String next_page_token;
    private final List<ResultsItem> results;
    private final String status;

    public SearchAPiResult(String str, List<ResultsItem> list, String str2) {
        sq8.m48649h(str, DataBufferUtils.KEY_NEXT_PAGE_TOKEN);
        sq8.m48649h(str2, "status");
        this.next_page_token = str;
        this.results = list;
        this.status = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchAPiResult copy$default(SearchAPiResult searchAPiResult, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchAPiResult.next_page_token;
        }
        if ((i & 2) != 0) {
            list = searchAPiResult.results;
        }
        if ((i & 4) != 0) {
            str2 = searchAPiResult.status;
        }
        return searchAPiResult.copy(str, list, str2);
    }

    public final String component1() {
        return this.next_page_token;
    }

    public final List<ResultsItem> component2() {
        return this.results;
    }

    public final String component3() {
        return this.status;
    }

    public final SearchAPiResult copy(String str, List<ResultsItem> list, String str2) {
        sq8.m48649h(str, DataBufferUtils.KEY_NEXT_PAGE_TOKEN);
        sq8.m48649h(str2, "status");
        return new SearchAPiResult(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAPiResult)) {
            return false;
        }
        SearchAPiResult searchAPiResult = (SearchAPiResult) obj;
        return sq8.m48644c(this.next_page_token, searchAPiResult.next_page_token) && sq8.m48644c(this.results, searchAPiResult.results) && sq8.m48644c(this.status, searchAPiResult.status);
    }

    public final String getNext_page_token() {
        return this.next_page_token;
    }

    public final List<ResultsItem> getResults() {
        return this.results;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.next_page_token.hashCode() * 31;
        List<ResultsItem> list = this.results;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SearchAPiResult(next_page_token=" + this.next_page_token + ", results=" + this.results + ", status=" + this.status + ")";
    }

    public /* synthetic */ SearchAPiResult(String str, List list, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, list, (i & 4) != 0 ? "" : str2);
    }
}
