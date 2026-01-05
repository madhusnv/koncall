package y5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y5.d */
/* loaded from: classes.dex */
public final class CallableC8558d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f41543a;

    /* renamed from: b */
    public final /* synthetic */ String f41544b;

    /* renamed from: c */
    public final /* synthetic */ Context f41545c;

    /* renamed from: d */
    public final /* synthetic */ int f41546d;

    /* renamed from: e */
    public final /* synthetic */ Object f41547e;

    public /* synthetic */ CallableC8558d(String str, Context context, Object obj, int i10, int i11) {
        this.f41543a = i11;
        this.f41544b = str;
        this.f41545c = context;
        this.f41547e = obj;
        this.f41546d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f41543a) {
            case 0:
                Object[] objArr = {(C8557c) this.f41547e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return AbstractC8560f.m15830b(this.f41544b, this.f41545c, Collections.unmodifiableList(arrayList), this.f41546d);
            default:
                try {
                    return AbstractC8560f.m15830b(this.f41544b, this.f41545c, (List) this.f41547e, this.f41546d);
                } catch (Throwable unused) {
                    return new C8559e(-3);
                }
        }
    }
}
