package com.sun.mail.util.logging;

import i0.m0;
import java.util.Collections;
import java.util.Date;
import java.util.Formattable;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class CompactFormatter extends Formatter {
    private final String fmt;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class Alternate implements Formattable {
        private final String left;
        private final String right;

        public Alternate(String str, String str2) {
            this.left = String.valueOf(str);
            this.right = String.valueOf(str2);
        }

        private String pad(int i10, String str, int i11) {
            int length = i11 - str.length();
            StringBuilder sb2 = new StringBuilder(i11);
            int i12 = 0;
            if ((i10 & 1) == 1) {
                while (i12 < length) {
                    sb2.append(' ');
                    i12++;
                }
                sb2.append(str);
            } else {
                sb2.append(str);
                while (i12 < length) {
                    sb2.append(' ');
                    i12++;
                }
            }
            return sb2.toString();
        }

        @Override // java.util.Formattable
        public void formatTo(java.util.Formatter formatter, int i10, int i11, int i12) {
            String strPad = this.left;
            String alternate = this.right;
            if ((i10 & 2) == 2) {
                strPad = strPad.toUpperCase(formatter.locale());
                alternate = alternate.toUpperCase(formatter.locale());
            }
            if ((i10 & 4) == 4) {
                strPad = CompactFormatter.this.toAlternate(strPad);
                alternate = CompactFormatter.this.toAlternate(alternate);
            }
            if (i12 <= 0) {
                i12 = Integer.MAX_VALUE;
            }
            int iMin = Math.min(strPad.length(), i12);
            if (iMin > (i12 >> 1)) {
                iMin = Math.max(iMin - alternate.length(), iMin >> 1);
            }
            if (iMin > 0) {
                if (iMin > strPad.length() && Character.isHighSurrogate(strPad.charAt(iMin - 1))) {
                    iMin--;
                }
                strPad = strPad.substring(0, iMin);
            }
            String strSubstring = alternate.substring(0, Math.min(i12 - iMin, alternate.length()));
            if (i11 > 0) {
                int i13 = i11 >> 1;
                if (strPad.length() < i13) {
                    strPad = pad(i10, strPad, i13);
                }
                if (strSubstring.length() < i13) {
                    strSubstring = pad(i10, strSubstring, i13);
                }
            }
            Object[] array = Collections.EMPTY_SET.toArray();
            formatter.format(strPad, array);
            if (strPad.length() != 0 && strSubstring.length() != 0) {
                formatter.format("|", array);
            }
            formatter.format(strSubstring, array);
        }
    }

    static {
        loadDeclaredClasses();
    }

    public CompactFormatter() {
        this.fmt = initFormat(getClass().getName());
    }

    private boolean defaultIgnore(StackTraceElement stackTraceElement) {
        return isSynthetic(stackTraceElement) || isStaticUtility(stackTraceElement) || isReflection(stackTraceElement);
    }

    private String findAndFormat(StackTraceElement[] stackTraceElementArr) {
        String stackTraceElement;
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                stackTraceElement = "";
                break;
            }
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i10];
            if (!ignore(stackTraceElement2)) {
                stackTraceElement = formatStackTraceElement(stackTraceElement2);
                break;
            }
            i10++;
        }
        if (isNullOrSpaces(stackTraceElement)) {
            for (StackTraceElement stackTraceElement3 : stackTraceElementArr) {
                if (!defaultIgnore(stackTraceElement3)) {
                    return formatStackTraceElement(stackTraceElement3);
                }
            }
        }
        return stackTraceElement;
    }

    private String formatStackTraceElement(StackTraceElement stackTraceElement) {
        String strSimpleClassName = simpleClassName(stackTraceElement.getClassName());
        String strReplace = strSimpleClassName != null ? stackTraceElement.toString().replace(stackTraceElement.getClassName(), strSimpleClassName) : stackTraceElement.toString();
        String strSimpleFileName = simpleFileName(stackTraceElement.getFileName());
        return (strSimpleFileName == null || !strReplace.startsWith(strSimpleFileName)) ? strReplace : strReplace.replace(stackTraceElement.getFileName(), "");
    }

    private Comparable<?> formatZonedDateTime(LogRecord logRecord) {
        Comparable<?> zonedDateTime = LogManagerProperties.getZonedDateTime(logRecord);
        return zonedDateTime == null ? new Date(logRecord.getMillis()) : zonedDateTime;
    }

    private String initFormat(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".format"));
        return isNullOrSpaces(strFromLogManager) ? "%7$#.160s%n" : strFromLogManager;
    }

    private static boolean isNullOrSpaces(String str) {
        return str == null || str.trim().length() == 0;
    }

    private boolean isReflection(StackTraceElement stackTraceElement) {
        try {
            return LogManagerProperties.isReflectionClass(stackTraceElement.getClassName());
        } catch (RuntimeException | Exception | LinkageError unused) {
            return stackTraceElement.getClassName().startsWith("java.lang.reflect.") || stackTraceElement.getClassName().startsWith("sun.reflect.");
        }
    }

    private boolean isStaticUtility(StackTraceElement stackTraceElement) {
        try {
            return LogManagerProperties.isStaticUtilityClass(stackTraceElement.getClassName());
        } catch (RuntimeException | Exception | LinkageError unused) {
            String className = stackTraceElement.getClassName();
            return (className.endsWith("s") && !className.endsWith("es")) || className.contains("Util") || className.endsWith("Throwables");
        }
    }

    private boolean isSynthetic(StackTraceElement stackTraceElement) {
        return stackTraceElement.getMethodName().indexOf(36) > -1;
    }

    private boolean isUnknown(StackTraceElement stackTraceElement) {
        return stackTraceElement.getLineNumber() < 0;
    }

    private static Class<?>[] loadDeclaredClasses() {
        return new Class[]{Alternate.class};
    }

    private static String replaceClassName(String str, Throwable th2) {
        if (!isNullOrSpaces(str)) {
            int i10 = 0;
            while (th2 != null) {
                Class<?> cls = th2.getClass();
                str = str.replace(cls.getName(), simpleClassName(cls));
                i10++;
                if (i10 == 65536) {
                    return str;
                }
                th2 = th2.getCause();
            }
        }
        return str;
    }

    private static String simpleClassName(Class<?> cls) {
        try {
            return cls.getSimpleName();
        } catch (InternalError unused) {
            return simpleClassName(cls.getName());
        }
    }

    private static String simpleFileName(String str) {
        int iLastIndexOf;
        return (str == null || (iLastIndexOf = str.lastIndexOf(46)) <= -1) ? str : str.substring(0, iLastIndexOf);
    }

    public Throwable apply(Throwable th2) {
        return SeverityComparator.getInstance().apply(th2);
    }

    @Override // java.util.logging.Formatter
    public String format(LogRecord logRecord) {
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        Locale locale = resourceBundle == null ? null : resourceBundle.getLocale();
        String message = formatMessage(logRecord);
        String thrown = formatThrown(logRecord);
        String error = formatError(logRecord);
        Object[] objArr = {formatZonedDateTime(logRecord), formatSource(logRecord), formatLoggerName(logRecord), formatLevel(logRecord), message, thrown, new Alternate(message, thrown), new Alternate(thrown, message), Long.valueOf(logRecord.getSequenceNumber()), formatThreadID(logRecord), error, new Alternate(message, error), new Alternate(error, message), formatBackTrace(logRecord), logRecord.getResourceBundleName(), logRecord.getMessage()};
        return locale == null ? String.format(this.fmt, objArr) : String.format(locale, this.fmt, objArr);
    }

    public String formatBackTrace(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        if (thrown == null) {
            return "";
        }
        StackTraceElement[] stackTrace = apply(thrown).getStackTrace();
        String strFindAndFormat = findAndFormat(stackTrace);
        if (isNullOrSpaces(strFindAndFormat)) {
            int i10 = 0;
            while (thrown != null) {
                StackTraceElement[] stackTrace2 = thrown.getStackTrace();
                String strFindAndFormat2 = findAndFormat(stackTrace2);
                if (isNullOrSpaces(strFindAndFormat2)) {
                    if (stackTrace.length == 0) {
                        stackTrace = stackTrace2;
                    }
                    i10++;
                    if (i10 != 65536) {
                        thrown = thrown.getCause();
                        strFindAndFormat = strFindAndFormat2;
                    }
                }
                strFindAndFormat = strFindAndFormat2;
                break;
            }
            if (isNullOrSpaces(strFindAndFormat) && stackTrace.length != 0) {
                return formatStackTraceElement(stackTrace[0]);
            }
        }
        return strFindAndFormat;
    }

    public String formatError(LogRecord logRecord) {
        return formatMessage(logRecord.getThrown());
    }

    public String formatLevel(LogRecord logRecord) {
        return logRecord.getLevel().getLocalizedName();
    }

    public String formatLoggerName(LogRecord logRecord) {
        return simpleClassName(logRecord.getLoggerName());
    }

    @Override // java.util.logging.Formatter
    public String formatMessage(LogRecord logRecord) {
        return replaceClassName(replaceClassName(super.formatMessage(logRecord), logRecord.getThrown()), logRecord.getParameters());
    }

    public String formatSource(LogRecord logRecord) {
        String sourceClassName = logRecord.getSourceClassName();
        if (sourceClassName == null) {
            return simpleClassName(logRecord.getLoggerName());
        }
        if (logRecord.getSourceMethodName() == null) {
            return simpleClassName(sourceClassName);
        }
        return simpleClassName(sourceClassName) + " " + logRecord.getSourceMethodName();
    }

    public Number formatThreadID(LogRecord logRecord) {
        return Long.valueOf(logRecord.getThreadID() & 4294967295L);
    }

    public String formatThrown(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        if (thrown == null) {
            return "";
        }
        String backTrace = formatBackTrace(logRecord);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(formatMessage(thrown));
        sb2.append(isNullOrSpaces(backTrace) ? "" : m0.m7378k(" ", backTrace));
        return sb2.toString();
    }

    public boolean ignore(StackTraceElement stackTraceElement) {
        return isUnknown(stackTraceElement) || defaultIgnore(stackTraceElement);
    }

    public String toAlternate(String str) {
        if (str != null) {
            return str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r2 <= (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r2 >= r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r4 >= r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r4 <= r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        return r7.substring(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String simpleClassName(java.lang.String r7) {
        /*
            if (r7 == 0) goto L47
            r0 = -1
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r7.length()
            if (r1 >= r5) goto L36
            int r5 = r7.codePointAt(r1)
            boolean r6 = java.lang.Character.isJavaIdentifierPart(r5)
            if (r6 != 0) goto L2b
            r6 = 46
            if (r5 != r6) goto L25
            int r3 = r2 + 1
            if (r3 == r1) goto L24
            if (r3 == r4) goto L24
            r3 = r2
            r2 = r1
            goto L30
        L24:
            return r7
        L25:
            int r5 = r2 + 1
            if (r5 != r1) goto L36
            r2 = r3
            goto L36
        L2b:
            r6 = 36
            if (r5 != r6) goto L30
            r4 = r1
        L30:
            int r5 = java.lang.Character.charCount(r5)
            int r1 = r1 + r5
            goto L7
        L36:
            if (r2 <= r0) goto L47
            int r2 = r2 + 1
            if (r2 >= r1) goto L47
            int r4 = r4 + 1
            if (r4 >= r1) goto L47
            if (r4 <= r2) goto L43
            r2 = r4
        L43:
            java.lang.String r7 = r7.substring(r2)
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.CompactFormatter.simpleClassName(java.lang.String):java.lang.String");
    }

    public CompactFormatter(String str) {
        this.fmt = str == null ? initFormat(getClass().getName()) : str;
    }

    public String formatMessage(Throwable th2) {
        String strReplaceClassName;
        if (th2 != null) {
            Throwable thApply = apply(th2);
            String localizedMessage = thApply.getLocalizedMessage();
            String string = thApply.toString();
            String strSimpleClassName = simpleClassName(thApply.getClass());
            if (!isNullOrSpaces(localizedMessage)) {
                if (string.contains(localizedMessage)) {
                    if (!string.startsWith(thApply.getClass().getName()) && !string.startsWith(strSimpleClassName)) {
                        strReplaceClassName = replaceClassName(simpleClassName(string), th2);
                    } else {
                        strReplaceClassName = replaceClassName(localizedMessage, th2);
                    }
                } else {
                    strReplaceClassName = replaceClassName(a1.m14335o(new StringBuilder(), simpleClassName(string), ": ", localizedMessage), th2);
                }
            } else {
                strReplaceClassName = replaceClassName(simpleClassName(string), th2);
            }
            return !strReplaceClassName.contains(strSimpleClassName) ? m0.m7379l(strSimpleClassName, ": ", strReplaceClassName) : strReplaceClassName;
        }
        return "";
    }

    private static String replaceClassName(String str, Object[] objArr) {
        if (!isNullOrSpaces(str) && objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    Class<?> cls = obj.getClass();
                    str = str.replace(cls.getName(), simpleClassName(cls));
                }
            }
        }
        return str;
    }
}
