package kl;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import ml.AbstractC4787b;
import ml.C4788c;
import nl.C5104a;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kl.a */
/* loaded from: classes.dex */
public final class C4105a extends FilterOutputStream {

    /* renamed from: a */
    public final C8687a f21001a;

    public C4105a(C8687a c8687a, ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f21001a = c8687a;
    }

    /* renamed from: h */
    public final void m8878h(AbstractC4787b abstractC4787b) throws IOException {
        C5104a c5104a;
        C4788c c4788c = abstractC4787b.f23823a;
        write((byte) (c4788c.f23827b | c4788c.f23826a.getValue() | c4788c.f23828c.getValue()));
        int i10 = abstractC4787b.f23823a.f23829d;
        C8687a c8687a = this.f21001a;
        switch (i10) {
            case 0:
                c5104a = new C5104a(c8687a, 2);
                break;
            case 1:
                c5104a = new C5104a(c8687a, 4);
                break;
            case 2:
                c5104a = new C5104a(c8687a, 7);
                break;
            case 3:
                c5104a = new C5104a(c8687a, 8);
                break;
            case 4:
                c5104a = new C5104a(c8687a, 5);
                break;
            case 5:
                c5104a = new C5104a(c8687a, 6);
                break;
            case 6:
                c5104a = new C5104a(c8687a, 3);
                break;
            case 7:
                c5104a = new C5104a(c8687a, 1);
                break;
            default:
                c5104a = new C5104a(c8687a, 0);
                break;
        }
        int iMo317E = c5104a.mo317E(abstractC4787b);
        if (iMo317E < 127) {
            write(iMo317E);
        } else {
            int i11 = 1;
            for (int i12 = iMo317E; i12 > 255; i12 >>= 8) {
                i11++;
            }
            write(i11 | 128);
            while (i11 > 0) {
                write(iMo317E >> ((i11 - 1) * 8));
                i11--;
            }
        }
        c5104a.mo316D(abstractC4787b, this);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
    }
}
