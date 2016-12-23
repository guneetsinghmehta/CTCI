import java.util.*;
class TrieNode {
    //$ indicates start
    //# indicated end
    char c;
    public List<TrieNode> adj;
    public TrieNode(char c) {
        this.c=c;
        adj=new LinkedList<TrieNode>();
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('$');
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            TrieNode x=getNode(current,c);
            if(x==null)
            {
                x=new TrieNode(c);
                current.adj.add(x);
                current=x;
            }
            else
            {
                current=x;
            }
        }
        current.adj.add(new TrieNode('*'));
    }

    public TrieNode getNode(TrieNode current,char c)
    {
        TrieNode ans=null;
        for(int i=0;i<current.adj.size();i++)
        {
            TrieNode x=current.adj.get(i);
            if(x.c==c){ans=x;break;}
        }
        return ans;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        boolean ans=true;
        TrieNode current=root;
        if(word.length()!=0)
        {
            for(int i=0;i<word.length();i++)
            {
                char c=word.charAt(i);
                TrieNode x=getNode(current,c);
                if(x!=null)
                {
                    current=x;
                }
                else
                {
                    ans=false;
                    break;
                }
            }
            if(ans)
            {
                TrieNode x=getNode(current,'*');
                if(x==null){ans=false;}
            }
        }
        return ans;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        boolean ans=true;
        TrieNode current=root;
        if(prefix.length()!=0)
        {
            for(int i=0;i<prefix.length();i++)
            {
                char c=prefix.charAt(i);
                TrieNode x=getNode(current,c);
                if(x!=null)
                {
                    current=x;
                }
                else
                {
                    ans=false;
                    break;
                }
            }
        }
        return ans;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");