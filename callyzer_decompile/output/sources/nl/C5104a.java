package nl;

import ai.AbstractC0151h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import kl.C4105a;
import ml.AbstractC4787b;
import ol.C5398a;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nl.a */
/* loaded from: classes.dex */
public final class C5104a extends AbstractC0151h {

    /* renamed from: b */
    public final /* synthetic */ int f25003b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5104a(C8687a c8687a, int i10) {
        super(c8687a);
        this.f25003b = i10;
    }

    @Override // ai.AbstractC0151h
    /* renamed from: D */
    public final void mo316D(AbstractC4787b abstractC4787b, C4105a c4105a) throws IOException {
        switch (this.f25003b) {
            case 0:
                C5105b c5105b = (C5105b) abstractC4787b;
                byte[] bArr = c5105b.f25005c;
                if (bArr != null) {
                    c4105a.write(bArr);
                    return;
                }
                Iterator it = c5105b.iterator();
                while (it.hasNext()) {
                    c4105a.m8878h((AbstractC4787b) it.next());
                }
                return;
            case 1:
                throw new ClassCastException();
            case 2:
                throw new ClassCastException();
            case 3:
                throw new ClassCastException();
            case 4:
                c4105a.write(((C5398a) abstractC4787b).f27088b);
                return;
            case 5:
                throw new ClassCastException();
            case 6:
                throw new ClassCastException();
            case 7:
                throw new ClassCastException();
            default:
                throw new ClassCastException();
        }
    }

    @Override // ai.AbstractC0151h
    /* renamed from: E */
    public final int mo317E(AbstractC4787b abstractC4787b) throws IOException {
        switch (this.f25003b) {
            case 0:
                C5105b c5105b = (C5105b) abstractC4787b;
                if (c5105b.f25005c == null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C4105a c4105a = new C4105a((C8687a) this.f482a, byteArrayOutputStream);
                    Iterator it = c5105b.iterator();
                    while (it.hasNext()) {
                        c4105a.m8878h((AbstractC4787b) it.next());
                    }
                    c5105b.f25005c = byteArrayOutputStream.toByteArray();
                }
                return c5105b.f25005c.length;
            case 1:
                throw new ClassCastException();
            case 2:
                throw new ClassCastException();
            case 3:
                throw new ClassCastException();
            case 4:
                return ((C5398a) abstractC4787b).f27088b.length;
            case 5:
                throw new ClassCastException();
            case 6:
                throw new ClassCastException();
            case 7:
                throw new ClassCastException();
            default:
                throw new ClassCastException();
        }
    }
}
