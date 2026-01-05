package p001o;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class gn7 {

    /* renamed from: c */
    public static final Pattern f25553c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f25554a = -1;

    /* renamed from: b */
    public int f25555b = -1;

    /* renamed from: a */
    public boolean m29148a() {
        return (this.f25554a == -1 || this.f25555b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m29149b(String str) throws NumberFormatException {
        Matcher matcher = f25553c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) sqi.m48729h(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) sqi.m48729h(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f25554a = i;
            this.f25555b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m29150c(Metadata metadata) {
        for (int i = 0; i < metadata.m6697e(); i++) {
            Metadata.Entry entryM6696d = metadata.m6696d(i);
            if (entryM6696d instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryM6696d;
                if ("iTunSMPB".equals(commentFrame.f8678c) && m29149b(commentFrame.f8679d)) {
                    return true;
                }
            } else if (entryM6696d instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryM6696d;
                if ("com.apple.iTunes".equals(internalFrame.f8685b) && "iTunSMPB".equals(internalFrame.f8686c) && m29149b(internalFrame.f8687d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
