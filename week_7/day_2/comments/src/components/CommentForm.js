import React, {useState} from "react";

const CommentForm = ({onCommentSubmit}) => {

  const [author, setAuthor] = useState("");
  const [text, setText] = useState("");

  const handleAuthorChange = (event) => {
    setAuthor(event.target.value);
  }

  const handleTextChange = (event) => {
    setText(event.target.value);
  }

  const handleCommentSubmit = (event) => {
    event.preventDefault();
    const newAuthor = author.trim();
    const newText = text.trim();
    if (!newAuthor || !newText){
      return
    }

    onCommentSubmit({
      author: newAuthor,
      text: newText
    });

    setAuthor("");
    setText("");
  }

  return (
    <form onSubmit={handleCommentSubmit}>
        <label htmlFor="author">Author: </label>
        <input required type="text" placeholder="Your name" value={author} onChange={handleAuthorChange}/>
        <label htmlFor="text">Text: </label>
        <input required type="text" placeholder="Say something..." value={text} onChange={handleTextChange}/>
        <input type="submit" value="Post"/>
    </form>
  )

}

export default CommentForm;