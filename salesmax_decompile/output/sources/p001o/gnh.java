package p001o;

import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import p001o.vy0;

/* loaded from: classes2.dex */
public final class gnh extends tb1 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // p001o.vy0
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo21721e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f46750b.f51023c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 != 22) {
                    if (i2 != 268435456) {
                        if (i2 != 1342177280) {
                            if (i2 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            i /= 2;
                        }
                    }
                }
            }
            i /= 3;
            i *= 2;
        }
        ByteBuffer byteBufferM49665l = m49665l(i);
        int i3 = this.f46750b.f51023c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM49665l.put((byte) 0);
                byteBufferM49665l.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM48735n = (short) (sqi.m48735n(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM49665l.put((byte) (sM48735n & 255));
                byteBufferM49665l.put((byte) ((sM48735n >> 8) & Constants.MAX_HOST_LENGTH));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM49665l.put(byteBuffer.get(iPosition + 1));
                byteBufferM49665l.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM49665l.put(byteBuffer.get(iPosition + 2));
                byteBufferM49665l.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM49665l.put(byteBuffer.get(iPosition + 1));
                byteBufferM49665l.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM49665l.put(byteBuffer.get(iPosition + 1));
                byteBufferM49665l.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM49665l.put(byteBuffer.get(iPosition + 1));
                byteBufferM49665l.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM49665l.flip();
    }

    @Override // p001o.tb1
    /* renamed from: h */
    public vy0.C17692a mo21722h(vy0.C17692a c17692a) throws vy0.C17693b {
        int i = c17692a.f51023c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new vy0.C17692a(c17692a.f51021a, c17692a.f51022b, 2) : vy0.C17692a.f51020e;
        }
        throw new vy0.C17693b(c17692a);
    }
}
