package p001o;

import com.amazonaws.util.StringUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class tz4 {

    /* renamed from: a */
    public String f48110a;

    /* renamed from: b */
    public Long f48111b;

    /* renamed from: c */
    public Long f48112c;

    public tz4(String str, Long l, Long l2) {
        this.f48110a = str;
        this.f48111b = l;
        this.f48112c = l2;
    }

    /* renamed from: a */
    public String m50795a() {
        return this.f48110a;
    }

    /* renamed from: b */
    public Long m50796b() {
        return this.f48112c;
    }

    /* renamed from: c */
    public Long m50797c() {
        return this.f48111b;
    }

    /* renamed from: d */
    public boolean m50798d() {
        return StringUtils.isBlank(this.f48110a) || (Objects.isNull(this.f48111b) && Objects.isNull(this.f48112c));
    }
}
