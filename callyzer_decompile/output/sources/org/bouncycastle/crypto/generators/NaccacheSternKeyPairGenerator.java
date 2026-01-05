package org.bouncycastle.crypto.generators;

import com.sun.mail.util.AbstractC1452a;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i10) {
        Vector vector = new Vector(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i11]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i10, int i11, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i10, i11, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i10);
        return bigIntegerCreateRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i10) {
        int iNextInt;
        int i11;
        if (((-i10) & i10) == i10) {
            return (int) ((i10 * (secureRandom.nextInt() & Integer.MAX_VALUE)) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i11 = iNextInt % i10;
        } while ((i10 - 1) + (iNextInt - i11) < 0);
        return i11;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i10 = 0; i10 < vector.size(); i10++) {
            vector3.addElement(vector.elementAt(i10));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j6;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        boolean z6;
        BigInteger bigInteger;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigIntegerMod;
        BigInteger bigInteger6;
        PrintStream printStream;
        StringBuilder sb2;
        int i10;
        BigInteger bigIntegerCreateRandomPrime;
        int i11;
        SecureRandom secureRandom;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply = ONE;
        BigInteger bigIntegerMultiply2 = bigIntegerMultiply;
        for (int i12 = 0; i12 < vectorPermuteList.size() / 2; i12++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(i12));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply = bigIntegerMultiply.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2.multiply(bigIntegerMultiply);
        int iBitLength = (((strength - bigIntegerMultiply3.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply2).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply).shiftLeft(1);
        long j10 = 0;
        while (true) {
            j6 = j10 + 1;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply4 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    z6 = zIsDebug;
                    bigInteger = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply4.add(bigInteger);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    zIsDebug = z6;
                }
                bigInteger2 = bigIntegerShiftLeft2;
                if (!bigIntegerMultiply3.gcd(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2)).equals(bigInteger)) {
                    continue;
                } else {
                    if (bigIntegerAdd.multiply(bigIntegerAdd2).bitLength() >= strength) {
                        break;
                    }
                    if (z6) {
                        PrintStream printStream2 = System.out;
                        StringBuilder sbM4567n = AbstractC1452a.m4567n(strength, "key size too small. Should be ", " but is actually ");
                        sbM4567n.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream2.println(sbM4567n.toString());
                    }
                }
            } else {
                z6 = zIsDebug;
                bigInteger2 = bigIntegerShiftLeft2;
            }
            j10 = j6;
            zIsDebug = z6;
            bigIntegerShiftLeft2 = bigInteger2;
        }
        if (z6) {
            bigInteger3 = bigIntegerGeneratePrime4;
            System.out.println("needed " + j6 + " tries to generate p and q.");
        } else {
            bigInteger3 = bigIntegerGeneratePrime4;
        }
        BigInteger bigIntegerMultiply5 = bigIntegerAdd.multiply(bigIntegerAdd2);
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger).multiply(bigIntegerAdd2.subtract(bigInteger));
        if (z6) {
            System.out.println("generating g");
        }
        long j11 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger4 = bigIntegerAdd;
            bigInteger5 = bigIntegerAdd2;
            int i13 = 0;
            while (i13 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i13));
                while (true) {
                    j11++;
                    i10 = i13;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    i11 = strength;
                    secureRandom = random;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply5).equals(ONE)) {
                        i13 = i10;
                        strength = i11;
                        random = secureRandom;
                    }
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i13 = i10 + 1;
                strength = i11;
                random = secureRandom;
            }
            int i14 = strength;
            SecureRandom secureRandom2 = random;
            bigIntegerMod = ONE;
            for (int i15 = 0; i15 < vectorPermuteList.size(); i15++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i15)).modPow(bigIntegerMultiply3.divide((BigInteger) vectorPermuteList.elementAt(i15)), bigIntegerMultiply5)).mod(bigIntegerMultiply5);
            }
            int i16 = 0;
            while (true) {
                if (i16 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply5);
                    BigInteger bigInteger7 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger7)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply5).equals(bigInteger7)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply5).equals(bigInteger7)) {
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime3), bigIntegerMultiply5).equals(bigInteger7)) {
                                    bigInteger6 = bigInteger3;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger6), bigIntegerMultiply5).equals(bigInteger7)) {
                                        break;
                                    }
                                    if (z6) {
                                        System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    }
                                } else if (z6) {
                                    printStream = System.out;
                                    sb2 = new StringBuilder("g has order phi(n)/a\n g: ");
                                    sb2.append(bigIntegerMod);
                                    printStream.println(sb2.toString());
                                }
                            } else if (z6) {
                                printStream = System.out;
                                sb2 = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb2.append(bigIntegerMod);
                                printStream.println(sb2.toString());
                            }
                        } else if (z6) {
                            printStream = System.out;
                            sb2 = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb2.append(bigIntegerMod);
                            printStream.println(sb2.toString());
                        }
                    } else if (z6) {
                        printStream = System.out;
                        sb2 = new StringBuilder("g has order phi(n)/4\n g:");
                        sb2.append(bigIntegerMod);
                        printStream.println(sb2.toString());
                    }
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i16)), bigIntegerMultiply5).equals(ONE)) {
                    i16++;
                } else if (z6) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i16) + "\n g: " + bigIntegerMod);
                }
            }
            bigInteger6 = bigInteger3;
            bigInteger3 = bigInteger6;
            bigIntegerAdd2 = bigInteger5;
            bigIntegerAdd = bigInteger4;
            strength = i14;
            random = secureRandom2;
        }
        if (z6) {
            System.out.println("needed " + j11 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply3 + " (" + bigIntegerMultiply3.bitLength() + " bits)");
            PrintStream printStream3 = System.out;
            StringBuilder sb3 = new StringBuilder("a:.......... ");
            sb3.append(bigIntegerGeneratePrime3);
            printStream3.println(sb3.toString());
            System.out.println("b:.......... " + bigInteger6);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigInteger4);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + bigIntegerMultiply5);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }
}
