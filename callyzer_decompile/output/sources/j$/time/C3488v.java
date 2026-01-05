package j$.time;

import j$.time.zone.C3495f;
import j$.time.zone.C3496g;
import j$.time.zone.C3498i;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* renamed from: j$.time.v */
/* loaded from: classes2.dex */
public final class C3488v extends ZoneId {

    /* renamed from: d */
    public static final /* synthetic */ int f18300d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b */
    public final String f18301b;

    /* renamed from: c */
    public final transient C3495f f18302c;

    public static C3488v a0(String str, boolean z6) {
        C3495f c3495fM8050a;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i10 == 0) && ((cCharAt < '0' || cCharAt > '9' || i10 == 0) && ((cCharAt != '~' || i10 == 0) && ((cCharAt != '.' || i10 == 0) && ((cCharAt != '_' || i10 == 0) && ((cCharAt != '+' || i10 == 0) && (cCharAt != '-' || i10 == 0))))))))) {
                    throw new C3401c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                c3495fM8050a = C3498i.m8050a(str);
            } catch (C3496g e2) {
                if (z6) {
                    throw e2;
                }
                c3495fM8050a = null;
            }
            return new C3488v(str, c3495fM8050a);
        }
        throw new C3401c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public C3488v(String str, C3495f c3495f) {
        this.f18301b = str;
        this.f18302c = c3495f;
    }

    @Override // j$.time.ZoneId
    /* renamed from: r */
    public final String mo7867r() {
        return this.f18301b;
    }

    @Override // j$.time.ZoneId
    /* renamed from: C */
    public final C3495f mo7865C() {
        C3495f c3495f = this.f18302c;
        return c3495f != null ? c3495f : C3498i.m8050a(this.f18301b);
    }

    private Object writeReplace() {
        return new C3467q((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    /* renamed from: X */
    public final void mo7866X(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f18301b);
    }
}
