package p001o;

import androidx.media3.common.C2181a;
import java.util.Collections;
import p001o.w5;
import p001o.zig;

/* loaded from: classes2.dex */
public final class lz0 extends zig {

    /* renamed from: e */
    public static final int[] f34548e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f34549b;

    /* renamed from: c */
    public boolean f34550c;

    /* renamed from: d */
    public int f34551d;

    public lz0(uth uthVar) {
        super(uthVar);
    }

    @Override // p001o.zig
    /* renamed from: b */
    public boolean mo23894b(zwc zwcVar) throws zig.C18653a {
        if (this.f34549b) {
            zwcVar.m60018V(1);
        } else {
            int iM60004H = zwcVar.m60004H();
            int i = (iM60004H >> 4) & 15;
            this.f34551d = i;
            if (i == 2) {
                this.f57261a.mo7072b(new C2181a.b().o0("audio/mpeg").m6751N(1).p0(f34548e[(iM60004H >> 2) & 3]).m6748K());
                this.f34550c = true;
            } else if (i == 7 || i == 8) {
                this.f57261a.mo7072b(new C2181a.b().o0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m6751N(1).p0(8000).m6748K());
                this.f34550c = true;
            } else if (i != 10) {
                throw new zig.C18653a("Audio format not supported: " + this.f34551d);
            }
            this.f34549b = true;
        }
        return true;
    }

    @Override // p001o.zig
    /* renamed from: c */
    public boolean mo23895c(zwc zwcVar, long j) {
        if (this.f34551d == 2) {
            int iM60020a = zwcVar.m60020a();
            this.f57261a.m52027e(zwcVar, iM60020a);
            this.f57261a.mo7071a(j, 1, iM60020a, 0, null);
            return true;
        }
        int iM60004H = zwcVar.m60004H();
        if (iM60004H != 0 || this.f34550c) {
            if (this.f34551d == 10 && iM60004H != 1) {
                return false;
            }
            int iM60020a2 = zwcVar.m60020a();
            this.f57261a.m52027e(zwcVar, iM60020a2);
            this.f57261a.mo7071a(j, 1, iM60020a2, 0, null);
            return true;
        }
        int iM60020a3 = zwcVar.m60020a();
        byte[] bArr = new byte[iM60020a3];
        zwcVar.m60031l(bArr, 0, iM60020a3);
        w5.C17781b c17781bM53967f = w5.m53967f(bArr);
        this.f57261a.mo7072b(new C2181a.b().o0("audio/mp4a-latm").m6752O(c17781bM53967f.f51496c).m6751N(c17781bM53967f.f51495b).p0(c17781bM53967f.f51494a).b0(Collections.singletonList(bArr)).m6748K());
        this.f34550c = true;
        return false;
    }
}
