package p001o;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class sa8 extends ntf {

    /* renamed from: c */
    public static final Pattern f45082c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f45083a = uh2.f48931c.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f45084b = uh2.f48930b.newDecoder();

    @Override // p001o.ntf
    /* renamed from: b */
    public Metadata mo33901b(mdb mdbVar, ByteBuffer byteBuffer) {
        String strM48094c = m48094c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strM48094c == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f45082c.matcher(strM48094c);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM35995e = kp0.m35995e(strGroup);
                strM35995e.hashCode();
                if (strM35995e.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM35995e.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    /* renamed from: c */
    public final String m48094c(ByteBuffer byteBuffer) {
        try {
            return this.f45083a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f45084b.decode(byteBuffer).toString();
                this.f45084b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f45084b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f45084b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f45083a.reset();
            byteBuffer.rewind();
        }
    }
}
