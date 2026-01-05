package l7;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.u */
/* loaded from: classes.dex */
public final class C4421u implements Comparable {

    /* renamed from: a */
    public final AbstractC4422v f22127a;

    /* renamed from: b */
    public final Bundle f22128b;

    /* renamed from: c */
    public final boolean f22129c;

    /* renamed from: d */
    public final int f22130d;

    /* renamed from: e */
    public final boolean f22131e;

    /* renamed from: f */
    public final int f22132f;

    public C4421u(AbstractC4422v abstractC4422v, Bundle bundle, boolean z6, int i10, boolean z10, int i11) {
        this.f22127a = abstractC4422v;
        this.f22128b = bundle;
        this.f22129c = z6;
        this.f22130d = i10;
        this.f22131e = z10;
        this.f22132f = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4421u other) {
        AbstractC4154l.m8923f(other, "other");
        boolean z6 = other.f22131e;
        boolean z10 = other.f22129c;
        Bundle bundle = other.f22128b;
        boolean z11 = this.f22129c;
        if (z11 && !z10) {
            return 1;
        }
        if (!z11 && z10) {
            return -1;
        }
        int i10 = this.f22130d - other.f22130d;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle source = this.f22128b;
        if (source != null && bundle == null) {
            return 1;
        }
        if (source == null && bundle != null) {
            return -1;
        }
        if (source != null) {
            AbstractC4154l.m8923f(source, "source");
            int size = source.size();
            AbstractC4154l.m8920c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z12 = this.f22131e;
        if (z12 && !z6) {
            return 1;
        }
        if (z12 || !z6) {
            return this.f22132f - other.f22132f;
        }
        return -1;
    }
}
