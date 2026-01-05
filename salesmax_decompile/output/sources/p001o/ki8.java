package p001o;

import androidx.media3.common.C2181a;
import p001o.l93;

/* loaded from: classes2.dex */
public final class ki8 extends k93 {

    /* renamed from: j */
    public final l93 f32273j;

    /* renamed from: k */
    public l93.InterfaceC15043b f32274k;

    /* renamed from: l */
    public long f32275l;

    /* renamed from: m */
    public volatile boolean f32276m;

    public ki8(dz4 dz4Var, iz4 iz4Var, C2181a c2181a, int i, Object obj, l93 l93Var) {
        super(dz4Var, iz4Var, 2, c2181a, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f32273j = l93Var;
    }

    @Override // p001o.xga.InterfaceC18153e
    /* renamed from: b */
    public void mo22073b() {
        this.f32276m = true;
    }

    /* renamed from: e */
    public void m35728e(l93.InterfaceC15043b interfaceC15043b) {
        this.f32274k = interfaceC15043b;
    }

    @Override // p001o.xga.InterfaceC18153e
    public void load() {
        if (this.f32275l == 0) {
            this.f32273j.mo34110b(this.f32274k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            iz4 iz4VarM32922e = this.f31660b.m32922e(this.f32275l);
            o5g o5gVar = this.f31667i;
            yd5 yd5Var = new yd5(o5gVar, iz4VarM32922e.f29386g, o5gVar.mo23960e(iz4VarM32922e));
            while (!this.f32276m && this.f32273j.mo34109a(yd5Var)) {
                try {
                } finally {
                    this.f32275l = yd5Var.getPosition() - this.f31660b.f29386g;
                }
            }
        } finally {
            hz4.m31298a(this.f31667i);
        }
    }
}
