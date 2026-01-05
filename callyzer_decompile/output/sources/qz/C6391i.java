package qz;

import ex.InterfaceC2137a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import p020v.a1;
import wc.C7976j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6391i implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f30824a;

    /* renamed from: b */
    public final /* synthetic */ long f30825b;

    /* renamed from: c */
    public final /* synthetic */ Closeable f30826c;

    public /* synthetic */ C6391i(Closeable closeable, long j6, int i10) {
        this.f30824a = i10;
        this.f30826c = closeable;
        this.f30825b = j6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() throws IOException {
        boolean z6;
        switch (this.f30824a) {
            case 0:
                C6398p c6398p = (C6398p) this.f30826c;
                long j6 = this.f30825b;
                synchronized (c6398p) {
                    long j10 = c6398p.f30857n;
                    long j11 = c6398p.f30856m;
                    if (j10 < j11) {
                        z6 = true;
                    } else {
                        c6398p.f30856m = j11 + 1;
                        z6 = false;
                    }
                }
                if (z6) {
                    EnumC6384b enumC6384b = EnumC6384b.PROTOCOL_ERROR;
                    c6398p.m12388h(enumC6384b, enumC6384b, null);
                    j6 = -1;
                } else {
                    try {
                        c6398p.f30842B.m12418z(1, 0, false);
                    } catch (IOException e2) {
                        EnumC6384b enumC6384b2 = EnumC6384b.PROTOCOL_ERROR;
                        c6398p.m12388h(enumC6384b2, enumC6384b2, e2);
                    }
                }
                return Long.valueOf(j6);
            default:
                C7976j c7976j = (C7976j) this.f30826c;
                long j12 = this.f30825b;
                File file = c7976j.f38368a;
                long j13 = c7976j.f38369b;
                if (!file.exists()) {
                    throw new IllegalArgumentException(("cannot create SdkSource, file does not exist: " + c7976j).toString());
                }
                if (!file.isFile()) {
                    throw new IllegalArgumentException(("cannot create a SdkSource from a directory: " + c7976j).toString());
                }
                if (j12 < 0) {
                    throw new IllegalArgumentException(a1.m14330j("start position should be >= 0, found ", j12).toString());
                }
                long j14 = j12 - 1;
                if (j13 >= j14) {
                    if (j13 > file.length() - 1) {
                        throw new IllegalArgumentException(a1.m14330j("endInclusive should be less than or equal to the length of the file, was ", j13).toString());
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    if (j12 > 0) {
                        randomAccessFile.seek(j12);
                    }
                    return randomAccessFile;
                }
                throw new IllegalArgumentException(("end index " + j13 + " must be greater than or equal to the start index minus one (" + j14 + ')').toString());
        }
    }
}
