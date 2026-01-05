package ly;

import al.C0174b;
import bt.i0;
import com.sun.mail.util.AbstractC1452a;
import fy.InterfaceC2401a;
import hy.AbstractC3054e;
import hy.C3052c;
import hy.C3058i;
import hy.C3059j;
import hy.C3060k;
import hy.InterfaceC3055f;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.JsonException;
import ky.AbstractC4271c;
import ky.C4289u;
import ky.C4294z;
import ky.InterfaceC4277i;
import l1.C4327p;
import pg.AbstractC5940u;
import pg.AbstractC5942w;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.i */
/* loaded from: classes3.dex */
public abstract class AbstractC4585i {

    /* renamed from: a */
    public static final C4586j f22716a = new C4586j();

    /* renamed from: b */
    public static final C4586j f22717b = new C4586j();

    /* renamed from: a */
    public static final JsonDecodingException m9420a(Number number, String key, String output) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(output, "output");
        return m9424e(-1, "Unexpected special floating-point value " + number + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m9433n(output, -1)));
    }

    /* renamed from: b */
    public static final JsonEncodingException m9421b(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m9433n(str, -1)));
    }

    /* renamed from: c */
    public static final JsonEncodingException m9422c(InterfaceC3055f interfaceC3055f) {
        return new JsonEncodingException("Value of type '" + interfaceC3055f.mo7277a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC3055f.mo7280e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* renamed from: d */
    public static final JsonDecodingException m9423d(int i10, CharSequence input, String message) {
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(input, "input");
        return m9424e(i10, message + "\nJSON input: " + ((Object) m9433n(input, i10)));
    }

    /* renamed from: e */
    public static final JsonDecodingException m9424e(int i10, String message) {
        AbstractC4154l.m8923f(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        AbstractC4154l.m8923f(message, "message");
        return new JsonDecodingException(message);
    }

    /* renamed from: f */
    public static final void m9425f(LinkedHashMap linkedHashMap, InterfaceC3055f interfaceC3055f, String str, int i10) {
        String str2 = AbstractC4154l.m8918a(interfaceC3055f.mo7280e(), C3059j.f16412b) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i10));
            return;
        }
        String message = "The suggested name '" + str + "' for " + str2 + ' ' + interfaceC3055f.mo7282g(i10) + " is already one of the names for " + str2 + ' ' + interfaceC3055f.mo7282g(((Number) AbstractC6674x.m12774b(linkedHashMap, str)).intValue()) + " in " + interfaceC3055f;
        AbstractC4154l.m8923f(message, "message");
        throw new JsonException(message);
    }

    /* renamed from: g */
    public static final InterfaceC3055f m9426g(InterfaceC3055f interfaceC3055f, C0174b module) {
        AbstractC4154l.m8923f(interfaceC3055f, "<this>");
        AbstractC4154l.m8923f(module, "module");
        if (!AbstractC4154l.m8918a(interfaceC3055f.mo7280e(), C3058i.f16411b)) {
            return interfaceC3055f.isInline() ? m9426g(interfaceC3055f.mo7284i(0), module) : interfaceC3055f;
        }
        AbstractC5940u.m11877c(interfaceC3055f);
        return interfaceC3055f;
    }

    /* renamed from: h */
    public static final byte m9427h(char c2) {
        if (c2 < '~') {
            return C4580d.f22709b[c2];
        }
        return (byte) 0;
    }

    /* renamed from: i */
    public static final String m9428i(InterfaceC3055f interfaceC3055f, AbstractC4271c json) {
        AbstractC4154l.m8923f(interfaceC3055f, "<this>");
        AbstractC4154l.m8923f(json, "json");
        for (Annotation annotation : interfaceC3055f.getAnnotations()) {
            if (annotation instanceof InterfaceC4277i) {
                return ((InterfaceC4277i) annotation).discriminator();
            }
        }
        return json.f21667a.f21684d;
    }

    /* renamed from: j */
    public static final Map m9429j(InterfaceC3055f descriptor, AbstractC4271c abstractC4271c) {
        AbstractC4154l.m8923f(abstractC4271c, "<this>");
        AbstractC4154l.m8923f(descriptor, "descriptor");
        C4327p c4327p = abstractC4271c.f21669c;
        i0 i0Var = new i0(24, descriptor, abstractC4271c);
        c4327p.getClass();
        AbstractC4154l.m8923f(descriptor, "descriptor");
        C4586j c4586j = f22716a;
        Object value = c4327p.m9050h(descriptor, c4586j);
        if (value == null) {
            value = i0Var.invoke();
            AbstractC4154l.m8923f(value, "value");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c4327p.f21788b;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c4586j, value);
        }
        return (Map) value;
    }

    /* renamed from: k */
    public static final int m9430k(InterfaceC3055f interfaceC3055f, AbstractC4271c json, String name) {
        AbstractC4154l.m8923f(interfaceC3055f, "<this>");
        AbstractC4154l.m8923f(json, "json");
        AbstractC4154l.m8923f(name, "name");
        if (m9434o(interfaceC3055f, json) != null) {
            Integer num = (Integer) m9429j(interfaceC3055f, json).get(name);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        int iMo7279d = interfaceC3055f.mo7279d(name);
        if (iMo7279d != -3 || !json.f21667a.f21685e) {
            return iMo7279d;
        }
        Integer num2 = (Integer) m9429j(interfaceC3055f, json).get(name);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    /* renamed from: l */
    public static final int m9431l(InterfaceC3055f interfaceC3055f, AbstractC4271c json, String name, String suffix) {
        AbstractC4154l.m8923f(interfaceC3055f, "<this>");
        AbstractC4154l.m8923f(json, "json");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(suffix, "suffix");
        int iM9430k = m9430k(interfaceC3055f, json, name);
        if (iM9430k != -3) {
            return iM9430k;
        }
        throw new SerializationException(interfaceC3055f.mo7277a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    /* renamed from: m */
    public static final void m9432m(C4599w c4599w, String str) {
        c4599w.m9461m(c4599w.f22763b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* renamed from: n */
    public static final CharSequence m9433n(CharSequence charSequence, int i10) {
        AbstractC4154l.m8923f(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                String str = i11 <= 0 ? "" : ".....";
                String str2 = i12 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM4568o = AbstractC1452a.m4568o(str);
                if (i11 < 0) {
                    i11 = 0;
                }
                int length = charSequence.length();
                if (i12 > length) {
                    i12 = length;
                }
                sbM4568o.append(charSequence.subSequence(i11, i12).toString());
                sbM4568o.append(str2);
                return sbM4568o.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* renamed from: o */
    public static final C4289u m9434o(InterfaceC3055f interfaceC3055f, AbstractC4271c json) {
        AbstractC4154l.m8923f(interfaceC3055f, "<this>");
        AbstractC4154l.m8923f(json, "json");
        if (AbstractC4154l.m8918a(interfaceC3055f.mo7280e(), C3060k.f16413b)) {
            return json.f21667a.f21686f;
        }
        return null;
    }

    /* renamed from: p */
    public static final Object m9435p(AbstractC4271c abstractC4271c, String discriminator, C4294z c4294z, InterfaceC2401a interfaceC2401a) {
        AbstractC4154l.m8923f(abstractC4271c, "<this>");
        AbstractC4154l.m8923f(discriminator, "discriminator");
        return new C4588l(abstractC4271c, c4294z, discriminator, interfaceC2401a.getDescriptor()).mo7708v(interfaceC2401a);
    }

    /* renamed from: q */
    public static final EnumC4601y m9436q(InterfaceC3055f desc, AbstractC4271c abstractC4271c) {
        AbstractC4154l.m8923f(desc, "desc");
        AbstractC5942w abstractC5942wMo7280e = desc.mo7280e();
        if (abstractC5942wMo7280e instanceof C3052c) {
            return EnumC4601y.POLY_OBJ;
        }
        if (AbstractC4154l.m8918a(abstractC5942wMo7280e, C3060k.f16414c)) {
            return EnumC4601y.LIST;
        }
        if (!AbstractC4154l.m8918a(abstractC5942wMo7280e, C3060k.f16415d)) {
            return EnumC4601y.OBJ;
        }
        InterfaceC3055f interfaceC3055fM9426g = m9426g(desc.mo7284i(0), abstractC4271c.f21668b);
        AbstractC5942w abstractC5942wMo7280e2 = interfaceC3055fM9426g.mo7280e();
        if ((abstractC5942wMo7280e2 instanceof AbstractC3054e) || AbstractC4154l.m8918a(abstractC5942wMo7280e2, C3059j.f16412b)) {
            return EnumC4601y.MAP;
        }
        throw m9422c(interfaceC3055fM9426g);
    }

    /* renamed from: r */
    public static final void m9437r(C4599w c4599w, Number number) {
        C4599w.m9446n(c4599w, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    /* renamed from: s */
    public static final String m9438s(byte b10) {
        return b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == 127 ? "invalid token" : "valid token";
    }
}
