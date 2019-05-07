package elven.CryptoJS;

import org.apache.commons.lang.StringUtils;

/**
 * At 0th position there will always be CipherText At 1st position -> IV At 2nd
 * position -> SALT At 3rd position -> PassPhrase At 4th position ->
 * IterationCount At 5th position -> KeySize
 *
 */
public class SecurityInfo {

    String iv;
    String salt;
    String passPhrase;
    String cipherText;
    int    iterationCount;
    int    keySize;


    public SecurityInfo( String[] values, String indices ) {
        int[] indexes = convert( indices );
        for ( int i = 0; i < indexes.length; i++ ) {
            int j = indexes[i];
            String val = values[i];
            switch ( j ) {
            case 0:
                setCipherText( val );
                break;
            case 1:
                setIv( val );
                break;
            case 2:
                setSalt( val );
                break;
            case 3:
                setPassPhrase( val );
                break;
            case 4:
                setIterationCount( getInt( val ) );
                break;
            case 5:
                setKeySize( getInt( val ) );
                break;
            }
        }
    
    }
    public SecurityInfo( String[] values, int[] indexes ) {
        for ( int i = 0; i < indexes.length; i++ ) {
            int j = indexes[i];
            String val = values[i];
            switch ( j ) {
            case 0:
                setCipherText( val );
                break;
            case 1:
                setIv( val );
                break;
            case 2:
                setSalt( val );
                break;
            case 3:
                setPassPhrase( val );
                break;
            case 4:
                setIterationCount( getInt( val ) );
                break;
            case 5:
                setKeySize( getInt( val ) );
                break;
            }
        }
    }

    public static boolean hasValue( String value ) {
        return !StringUtils.isEmpty( value );
    }

    public static int getInt( String s ) {

        if ( StringUtils.isNumeric(s) && hasValue( s ) ) {
            return Integer.parseInt( s );
        }

        return 0;
    }
    private static String getNum( String s ) {
        switch ( s ) {
            case "a":
                return "0";
            case "b":
                return "1";
            case "c":
                return "2";
            case "d":
                return "3";
            case "e":
                return "4";
            case "f":
                return "5";
        }
        return s;
    }
    private static int[] convert( String indices ) {
        String[] indexes = indices.split( "," );

        int[] ints = new int[indexes.length];

        for ( int i = 0; i < indexes.length; i++ ) {
            String s = getNum( indexes[i] );
            ints[i] = getInt( s );
        }
        return ints;
    }


    public String getIv() {
        return iv;
    }

    public void setIv( String iv ) {
        this.iv = iv;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt( String salt ) {
        this.salt = salt;
    }

    public String getPassPhrase() {
        return passPhrase;
    }

    public void setPassPhrase( String passPhrase ) {
        this.passPhrase = passPhrase;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText( String cipherText ) {
        this.cipherText = cipherText;
    }

    public int getIterationCount() {
        return iterationCount;
    }

    public void setIterationCount( int iterationCount ) {
        this.iterationCount = iterationCount;
    }

    public int getKeySize() {
        return keySize;
    }

    public void setKeySize( int keySize ) {
        this.keySize = keySize;
    }

    @Override
    public String toString() {
        return "EncryptInfo [iv=" + iv + ", salt=" + salt + ", passPhrase=" + passPhrase + ", cipherText=" + cipherText + ", iterationCount=" + iterationCount + ", keySize=" + keySize + "]";
    }

}
