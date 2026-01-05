package androidx.fragment.app;

import android.view.View;
import ex.InterfaceC2139c;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public final class C0351p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f2655a;

    /* renamed from: b */
    public final /* synthetic */ Collection f2656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0351p(int i10, Collection collection) {
        super(1);
        this.f2655a = i10;
        this.f2656b = collection;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f2655a;
        Collection<?> collection = this.f2656b;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC4154l.m8923f(entry, "entry");
                View view = (View) entry.getValue();
                Field field = c6.v0.f5527a;
                return Boolean.valueOf(AbstractC6663m.m12767z(collection, c6.n0.m2454f(view)));
            case 1:
                return Boolean.valueOf(collection.contains(obj));
            case 2:
                return Boolean.valueOf(collection.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(collection));
        }
    }
}
