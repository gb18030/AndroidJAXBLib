package ua.kharkov.borovyk.wiki_search.mynetwork;

import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 9/19/12
 * Time: 6:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IElementAdapter {

    public void init(InputStream is);

    public List getChildren();

    public IElementAdapter getChild(String name);

    /**
     * if value doesnt exist return ""
     * @param name
     * @return
     */
    public String getValue(String name);

    public String getAttributeValue(String name);


}
