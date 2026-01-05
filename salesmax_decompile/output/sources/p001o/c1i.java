package p001o;

import android.text.style.URLSpan;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class c1i {

    /* renamed from: a */
    public final WeakHashMap f17142a = new WeakHashMap();

    /* renamed from: a */
    public final URLSpan m20089a(n8i n8iVar) {
        sq8.m48649h(n8iVar, "urlAnnotation");
        WeakHashMap weakHashMap = this.f17142a;
        Object uRLSpan = weakHashMap.get(n8iVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(n8iVar.m40250a());
            weakHashMap.put(n8iVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}
