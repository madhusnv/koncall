package p001o;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/* loaded from: classes.dex */
public interface ed8 {
    @Streaming
    @GET
    /* renamed from: a */
    Call<cre> m24786a(@Url String str);
}
