package p001o;

/* loaded from: classes6.dex */
public final class m6f {

    /* renamed from: a */
    public static final m6f f34874a = new m6f();

    /* renamed from: b */
    public static final mge f34875b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f34875b = new mge("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
