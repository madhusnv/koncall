package p001o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class nv0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ SimpleDateFormat f37344a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f37344a.format((Date) obj);
    }
}
