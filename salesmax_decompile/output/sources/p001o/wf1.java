package p001o;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class wf1 {
    /* renamed from: a */
    public static wf1 m54284a(List list) {
        return new x31(list);
    }

    /* renamed from: b */
    public static DataEncoder m54285b() {
        return new JsonDataEncoderBuilder().configureWith(x01.f52965a).ignoreNullValues(true).build();
    }

    /* renamed from: c */
    public abstract List mo54286c();
}
