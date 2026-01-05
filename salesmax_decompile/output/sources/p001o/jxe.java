package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class jxe extends q81 {

    /* renamed from: d */
    public final hxe f31230d;

    public jxe() {
        this.f31230d = new hxe();
    }

    @Override // p001o.hgf
    /* renamed from: b */
    public List mo30425b() {
        String str;
        List listMo30425b = super.mo30425b();
        String strM31266q = mo30426c().m31266q();
        if (strM31266q != null) {
            str = "Extended request ID: " + strM31266q;
        } else {
            str = null;
        }
        return kh3.x0(listMo30425b, ch3.m21250o(str));
    }

    @Override // p001o.q81
    /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public hxe mo34658a() {
        return this.f31230d;
    }

    public jxe(String str) {
        super(str);
        this.f31230d = new hxe();
    }
}
