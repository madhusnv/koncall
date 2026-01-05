package p001o;

import android.text.TextUtils;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class iri {

    /* renamed from: a */
    public static final iri f29171a = new iri();

    /* renamed from: a */
    public static final File m32648a() {
        if (a94.m16694d(iri.class)) {
            return null;
        }
        try {
            File file = new File(C10773c.m13019l().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            a94.m16692b(th, iri.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final Map m32649c(File file) {
        int i;
        if (a94.m16694d(iri.class)) {
            return null;
        }
        try {
            sq8.m48649h(file, TransferTable.COLUMN_FILE);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                int i2 = 0;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i3 = byteBufferWrap.getInt();
                int i4 = i3 + 4;
                if (iAvailable < i4) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3, sh2.f45422b));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[i5] = jSONArrayNames.getString(i5);
                }
                fp0.m27248F(strArr);
                HashMap map = new HashMap();
                int i6 = 0;
                while (i6 < length) {
                    String str = strArr[i6];
                    if (str == null) {
                        i = i2;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i7 = 1;
                        while (i2 < length2) {
                            int i8 = jSONArray.getInt(i2);
                            iArr[i2] = i8;
                            i7 *= i8;
                            i2++;
                        }
                        int i9 = i7 * 4;
                        int i10 = i4 + i9;
                        if (i10 > iAvailable) {
                            return null;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i4, i9);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        gna gnaVar = new gna(iArr);
                        i = 0;
                        byteBufferWrap2.asFloatBuffer().get(gnaVar.m29151a(), 0, i7);
                        map.put(str, gnaVar);
                        i4 = i10;
                    }
                    i6++;
                    i2 = i;
                }
                return map;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, iri.class);
            return null;
        }
    }

    /* renamed from: b */
    public final String m32650b(String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(str, "str");
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = sq8.m48651j(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String strJoin = TextUtils.join(" ", (String[]) new mge("\\s+").m38998j(str.subSequence(i, length + 1).toString(), 0).toArray(new String[0]));
            sq8.m48648g(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final int[] m32651d(String str, int i) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(str, "texts");
            int[] iArr = new int[i];
            String strM32650b = m32650b(str);
            Charset charsetForName = Charset.forName(HTTP.UTF_8);
            sq8.m48648g(charsetForName, "forName(\"UTF-8\")");
            byte[] bytes = strM32650b.getBytes(charsetForName);
            sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & 255;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}
