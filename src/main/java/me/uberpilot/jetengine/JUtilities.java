package me.uberpilot.jetengine;

import java.util.List;

public class JUtilities
{
    protected JUtilities() {}

    public static String punctuateList(List<? extends String> list)
    {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < list.size(); i++)
        {
            builder.append(list.get(i));
            if(i != list.size() - 1 && list.size() > 1)
            {
                if(i != list.size() - 2)
                {
                    builder.append(", ");
                }
                else
                {
                    builder.append(", and ");
                }
            }
        }
        return builder.toString();
    }

    /**
     * Utility method to check if a string is empty or null.
     * @param string String to be checked.
     * @return Boolean. Whether the string is empty or null.
     */
    public static boolean isEmptyOrNull(String string)
    {
        return string == null || string.isEmpty();
    }
}
