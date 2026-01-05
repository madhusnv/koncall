package p001o;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public class h79 {

    /* renamed from: a */
    public final String f26332a;

    public h79(String str) {
        this.f26332a = (String) dgd.m23062o(str);
    }

    /* renamed from: f */
    public static h79 m29889f(char c) {
        return new h79(String.valueOf(c));
    }

    /* renamed from: g */
    public static h79 m29890g(String str) {
        return new h79(str);
    }

    /* renamed from: a */
    public Appendable m29891a(Appendable appendable, Iterator it) throws IOException {
        dgd.m23062o(appendable);
        if (it.hasNext()) {
            appendable.append(m29896h(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f26332a);
                appendable.append(m29896h(it.next()));
            }
        }
        return appendable;
    }

    /* renamed from: b */
    public final StringBuilder m29892b(StringBuilder sb, Iterable iterable) {
        return m29893c(sb, iterable.iterator());
    }

    /* renamed from: c */
    public final StringBuilder m29893c(StringBuilder sb, Iterator it) {
        try {
            m29891a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final String m29894d(Iterable iterable) {
        return m29895e(iterable.iterator());
    }

    /* renamed from: e */
    public final String m29895e(Iterator it) {
        return m29893c(new StringBuilder(), it).toString();
    }

    /* renamed from: h */
    public CharSequence m29896h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
