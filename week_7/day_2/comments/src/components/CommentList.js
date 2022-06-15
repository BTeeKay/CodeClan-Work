import React from 'react';
import Comment from './Comment'

const CommentList = ({comments}) => {
    
    const commentNodes = comments.map((comment) => {
        return (
            <Comment comment={comment} key={comment.id} />
    )
    }) 

    return (
        <>
            <p>I am the comment list</p>
            {commentNodes}
        </>
    )
};

export default CommentList;