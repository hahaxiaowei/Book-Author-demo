package cn.edu.hfut.xc.bookauthordemo.common.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by sunwei on 2018/1/4 Time:9:25
 */
public class StringUtil {
    public static final String EMPTY_STR = "";

    public StringUtil() {
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static String padRight(String str, int totalWidth, char paddingChar) {
        if (isNullOrEmpty(str)) {
            str = "";
        }

        int strLen = str.length();
        if (strLen >= totalWidth) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(totalWidth);
            sb.append(str);

            while(sb.length() < totalWidth) {
                sb.append(paddingChar);
            }

            return sb.toString();
        }
    }

    public static String padLeft(String str, int totalWidth, char paddingChar) {
        if (isNullOrEmpty(str)) {
            str = "";
        }

        int strLen = str.length();
        if (strLen >= totalWidth) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(totalWidth);
            int len = totalWidth - strLen;

            while(sb.length() < len) {
                sb.append(paddingChar);
            }

            sb.append(str);
            return sb.toString();
        }
    }

    public static String trimEnd(String target, char c) {
        if (!isNullOrEmpty(target) && target.endsWith(String.valueOf(c))) {
            for(int i = target.length() - 1; i >= 0; --i) {
                if (target.charAt(i) != c) {
                    return target.substring(0, i + 1);
                }

                if (i == 0) {
                    return "";
                }
            }

            return target;
        } else {
            return target;
        }
    }

    public static String trimStart(String target, char c) {
        if (!isNullOrEmpty(target) && target.startsWith(String.valueOf(c))) {
            int len = target.length() - 1;

            for(int i = 0; i <= len; ++i) {
                if (target.charAt(i) != c) {
                    return target.substring(i);
                }

                if (i == len) {
                    return "";
                }
            }

            return target;
        } else {
            return target;
        }
    }

    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static int getDefaultByteCount(String text) {
        return isNullOrEmpty(text) ? 0 : text.getBytes().length;
    }

    public static String getErrorDetail(Exception e) {
        Writer w = null;
        PrintWriter pw = null;

        try {
            w = new StringWriter();
            pw = new PrintWriter(w);
            e.printStackTrace(pw);
            String var3 = w.toString();
            return var3;
        } catch (Exception var13) {
            ;
        } finally {
            if (w != null) {
                try {
                    w.close();
                } catch (IOException var12) {
                    var12.printStackTrace();
                }
            }

            if (pw != null) {
                pw.close();
            }

        }

        return "";
    }

    public static Boolean isEqual(String a, String b) {
        if (a == null && b == null) {
            return true;
        } else {
            return a != null ? a.equals(b) : b.equals(a);
        }
    }

    public static boolean isNullOrEmpty(Object obj) {
        return obj == null || "".equals(String.valueOf(obj).trim());
    }

    public static String convertDistritCodes(String distritCodes) {
        if (!isNullOrEmpty(distritCodes)) {
            StringBuffer strb = new StringBuffer();
            String[] distritCodesArray = distritCodes.split(",");
            String[] var3 = distritCodesArray;
            int var4 = distritCodesArray.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                String distritCode = var3[var5];
                if ("0000".equals(distritCode.substring(2, 6))) {
                    strb.append(distritCode.substring(0, 2));
                } else if ("00".equals(distritCode.substring(4, 6))) {
                    if (strb.length() > 0) {
                        strb.append(",");
                    }

                    strb.append(distritCode.substring(0, 4));
                } else {
                    if (strb.length() > 0) {
                        strb.append(",");
                    }

                    strb.append(distritCode);
                }
            }

            return strb.toString();
        } else {
            return null;
        }
    }

    public static String toEntityField(String sqlField) {
        if (sqlField == null) {
            return "";
        } else {
            StringBuffer sb = new StringBuffer();
            boolean flag = false;

            for(int i = 0; i < sqlField.length(); ++i) {
                char cur = sqlField.charAt(i);
                if (cur == '_') {
                    flag = true;
                } else if (flag) {
                    sb.append(Character.toUpperCase(cur));
                    flag = false;
                } else {
                    sb.append(Character.toLowerCase(cur));
                }
            }

            return sb.toString();
        }
    }

    public static String toSqlField(String entityField) {
        if (entityField == null) {
            return "";
        } else {
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i < entityField.length(); ++i) {
                char cur = entityField.charAt(i);
                if (Character.isUpperCase(cur)) {
                    sb.append("_");
                    sb.append(cur);
                } else {
                    sb.append(cur);
                }
            }

            return sb.toString().toLowerCase();
        }
    }

    public static String[] spiltStringToArray(String str, String seprator) {
        List<String> list = new ArrayList();
        if (isNullOrEmpty(str)) {
            return null;
        } else {
            int index = str.indexOf(seprator);
            if (index < 0) {
                list.add(str);
            } else {
                while(index >= 0) {
                    String tem = str.substring(0, index);
                    list.add(tem);
                    str = str.substring(index + 1);
                    index = str.indexOf(seprator);
                }

                if (!isNullOrEmpty(str)) {
                    list.add(str);
                }
            }

            String[] arr = new String[list.size()];

            for(int i = 0; i < list.size(); ++i) {
                arr[i] = (String)list.get(i);
            }

            return arr;
        }
    }
}
