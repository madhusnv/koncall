package mf;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mf.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C4720c implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C4720c f23621b = new C4720c(0);

    /* renamed from: a */
    public final /* synthetic */ int f23622a;

    public /* synthetic */ C4720c(int i10) {
        this.f23622a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23622a) {
        }
        return ((Scope) obj).f6001b.compareTo(((Scope) obj2).f6001b);
    }
}
