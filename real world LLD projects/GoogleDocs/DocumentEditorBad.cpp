#include<bits/stdc++.h>
using namespace std;

//no solid principles applied here
//1) single responsibility principle ❌ (DocumentEditor class have many reasons to change)
//2) Open closed principle ❌ (we cannot add new functionality without altering old code)
class DocumentEditor{
    private:
        vector<string> DocumentElements;
        string renderedDocument;

    public:
        //add text as plain text
        void addText(string text){
            DocumentElements.push_back(text);
        }

        //add image represented by it's path
        void addImage(string imagePath){
            DocumentElements.push_back(imagePath);
        }

        //render the document by checking type of each element at runtime
        string renderDocument(){
            if(renderedDocument.empty()){
                string result;
                for(auto element : DocumentElements){
                    if(element.size() > 4 && (element.substr(element.size() - 4) == ".jpg") || 
                    (element.substr(element.size() - 4) == ".png")){
                        result += "[Image: " + element + "]" + "\n";
                    }
                    else{
                        result += element + "\n";
                    }
                }
                renderedDocument = result;
            }
            return renderedDocument;
        }

        void saveToFile(){
            //open document.txt file and overwrite it, if not present create new one
            //now you can write with the help of file
            ofstream file("document.txt");
            if(file.is_open()){
                file << renderDocument();
                file.close();
                cout<<"Document saved as document.txt\n";
            }
            else{
                cout<<"Error:unable to open file\n";
            }
        }
};

int main(){
    DocumentEditor editor;
    editor.addText("hello world!");
    editor.addImage("image.png");
    editor.addText("this is document editor");

    cout<<editor.renderDocument()<<"\n";
    
    editor.saveToFile();
    return 0;
}