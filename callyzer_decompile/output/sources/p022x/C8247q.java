package p022x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import k0.ExecutorC3900j;
import p020v.f0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.q */
/* loaded from: classes.dex */
public final class C8247q implements InterfaceC8248r {

    /* renamed from: a */
    public final List f39390a;

    /* renamed from: b */
    public final f0 f39391b;

    /* renamed from: c */
    public final ExecutorC3900j f39392c;

    /* renamed from: d */
    public final int f39393d;

    /* renamed from: e */
    public C8237g f39394e = null;

    public C8247q(int i10, ArrayList arrayList, ExecutorC3900j executorC3900j, f0 f0Var) {
        this.f39393d = i10;
        this.f39390a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f39391b = f0Var;
        this.f39392c = executorC3900j;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: a */
    public final Object mo15421a() {
        return null;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: b */
    public final C8237g mo15422b() {
        return this.f39394e;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: c */
    public final Executor mo15423c() {
        return this.f39392c;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: d */
    public final int mo15424d() {
        return this.f39393d;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: e */
    public final CameraCaptureSession.StateCallback mo15425e() {
        return this.f39391b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8247q) {
            C8247q c8247q = (C8247q) obj;
            List list = c8247q.f39390a;
            if (Objects.equals(this.f39394e, c8247q.f39394e) && this.f39393d == c8247q.f39393d) {
                List list2 = this.f39390a;
                if (list2.size() == list.size()) {
                    for (int i10 = 0; i10 < list2.size(); i10++) {
                        if (!((C8238h) list2.get(i10)).equals(list.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: f */
    public final List mo15426f() {
        return this.f39390a;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: h */
    public final void mo15428h(C8237g c8237g) {
        if (this.f39393d == 1) {
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }
        this.f39394e = c8237g;
    }

    public final int hashCode() {
        int iHashCode = this.f39390a.hashCode() ^ 31;
        int i10 = (iHashCode << 5) - iHashCode;
        C8237g c8237g = this.f39394e;
        int iHashCode2 = (c8237g == null ? 0 : c8237g.f39376a.hashCode()) ^ i10;
        return this.f39393d ^ ((iHashCode2 << 5) - iHashCode2);
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: g */
    public final void mo15427g(CaptureRequest captureRequest) {
    }
}
