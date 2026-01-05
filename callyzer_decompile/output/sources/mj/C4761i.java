package mj;

import com.google.firebase.encoders.EncodingException;
import jj.C3777b;
import jj.InterfaceC3779d;
import jj.InterfaceC3781f;
import og.p0;
import pg.C5925f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mj.i */
/* loaded from: classes.dex */
public final class C4761i implements InterfaceC3781f {

    /* renamed from: a */
    public final /* synthetic */ int f23762a;

    /* renamed from: b */
    public boolean f23763b = false;

    /* renamed from: c */
    public boolean f23764c = false;

    /* renamed from: d */
    public C3777b f23765d;

    /* renamed from: e */
    public final InterfaceC3779d f23766e;

    public /* synthetic */ C4761i(InterfaceC3779d interfaceC3779d, int i10) {
        this.f23762a = i10;
        this.f23766e = interfaceC3779d;
    }

    @Override // jj.InterfaceC3781f
    public final InterfaceC3781f add(String str) {
        switch (this.f23762a) {
            case 0:
                if (this.f23763b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f23763b = true;
                ((C4759g) this.f23766e).m9679i(this.f23765d, str, this.f23764c);
                return this;
            case 1:
                if (this.f23763b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f23763b = true;
                ((p0) this.f23766e).m10805g(this.f23765d, str, this.f23764c);
                return this;
            default:
                if (this.f23763b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f23763b = true;
                ((C5925f) this.f23766e).m11611g(this.f23765d, str, this.f23764c);
                return this;
        }
    }

    @Override // jj.InterfaceC3781f
    /* renamed from: f */
    public final InterfaceC3781f mo8307f(boolean z6) {
        switch (this.f23762a) {
            case 0:
                if (this.f23763b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f23763b = true;
                ((C4759g) this.f23766e).m9677g(this.f23765d, z6 ? 1 : 0, this.f23764c);
                return this;
            case 1:
                if (this.f23763b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f23763b = true;
                ((p0) this.f23766e).m10806h(this.f23765d, z6 ? 1 : 0, this.f23764c);
                return this;
            default:
                if (this.f23763b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f23763b = true;
                ((C5925f) this.f23766e).m11612h(this.f23765d, z6 ? 1 : 0, this.f23764c);
                return this;
        }
    }
}
