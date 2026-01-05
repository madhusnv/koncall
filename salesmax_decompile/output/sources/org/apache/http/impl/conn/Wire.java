package org.apache.http.impl.conn;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class Wire {
    private final String id;
    private final sia log;

    public Wire(sia siaVar, String str) {
        this.id = str;
    }

    private void wire(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = inputStream.read();
            if (i == -1) {
                if (sb.length() <= 0) {
                    return;
                }
                sb.append(TokenParser.DQUOTE);
                sb.insert(0, TokenParser.DQUOTE);
                sb.insert(0, str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.id);
                sb2.append(" ");
                sb2.append(sb.toString());
                throw null;
            }
            if (i == 13) {
                sb.append("[\\r]");
            } else {
                if (i == 10) {
                    sb.append("[\\n]\"");
                    sb.insert(0, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                    sb.insert(0, str);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.id);
                    sb3.append(" ");
                    sb3.append(sb.toString());
                    throw null;
                }
                if (i < 32 || i > 127) {
                    sb.append("[0x");
                    sb.append(Integer.toHexString(i));
                    sb.append("]");
                } else {
                    sb.append((char) i);
                }
            }
        }
    }

    public boolean enabled() {
        throw null;
    }

    public void input(InputStream inputStream) throws IOException {
        Args.notNull(inputStream, "Input");
        wire("<< ", inputStream);
    }

    public void output(InputStream inputStream) throws IOException {
        Args.notNull(inputStream, "Output");
        wire(">> ", inputStream);
    }

    public Wire(sia siaVar) {
        this(siaVar, "");
    }

    public void input(byte[] bArr, int i, int i2) throws IOException {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void output(byte[] bArr, int i, int i2) throws IOException {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void input(byte[] bArr) throws IOException {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr));
    }

    public void output(byte[] bArr) throws IOException {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr));
    }

    public void input(int i) throws IOException {
        input(new byte[]{(byte) i});
    }

    public void output(int i) throws IOException {
        output(new byte[]{(byte) i});
    }

    public void input(String str) throws IOException {
        Args.notNull(str, "Input");
        input(str.getBytes());
    }

    public void output(String str) throws IOException {
        Args.notNull(str, "Output");
        output(str.getBytes());
    }
}
