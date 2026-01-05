package p001o;

import com.bumptech.glide.load.AbstractC10730a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public class w6g implements ioe {

    /* renamed from: a */
    public final List f51542a;

    /* renamed from: b */
    public final ioe f51543b;

    /* renamed from: c */
    public final wo0 f51544c;

    public w6g(List list, ioe ioeVar, wo0 wo0Var) {
        this.f51542a = list;
        this.f51543b = ioeVar;
        this.f51544c = wo0Var;
    }

    /* renamed from: e */
    public static byte[] m54006e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Opcodes.ACC_ENUM);
        try {
            byte[] bArr = new byte[Opcodes.ACC_ENUM];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p001o.ioe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zne mo16416b(InputStream inputStream, int i, int i2, rec recVar) throws IOException {
        byte[] bArrM54006e = m54006e(inputStream);
        if (bArrM54006e == null) {
            return null;
        }
        return this.f51543b.mo16416b(ByteBuffer.wrap(bArrM54006e), i, i2, recVar);
    }

    @Override // p001o.ioe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(InputStream inputStream, rec recVar) {
        return !((Boolean) recVar.m46585c(ts7.f47670b)).booleanValue() && AbstractC10730a.m12694f(this.f51542a, inputStream, this.f51544c) == ImageHeaderParser.ImageType.GIF;
    }
}
