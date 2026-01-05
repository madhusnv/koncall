package p001o;

import java.util.Map;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public final class xx7 extends zri implements qb2 {
    public xx7() {
        super(true, 8);
    }

    /* renamed from: t */
    public ux7 m56937t() {
        return new yx7(m59806n());
    }

    public String toString() {
        return "HeadersBuilder " + m59803k() + TokenParser.SP;
    }

    @Override // p001o.qb2
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public xx7 mo26958a() {
        Map mapM19701a = bsi.m19701a(m59806n());
        xx7 xx7Var = new xx7();
        xx7Var.m59806n().putAll(mapM19701a);
        return xx7Var;
    }
}
