<template>
  <div class="todo-container">
    <h2>Todo List</h2>
    <form class="input-todo-form">
      <input type="text" class="input-todo" placeholder="enter to add" />
      <button type="submit" @click="addTodo">Add</button>
    </form>
    <ul>
      <li class="todo-item" v-for="(todo, index) in todos" v-bind:key="index">
        <p class="text">{{todo.text}}</p>
        <button v-if="todo.completed" @click="complete(index)" class="complete completed">Complete</button>
        <button v-else @click="complete(index)" class="complete">Complete</button>
        <button @click="deleteTodo(index)" class="delete">Delete</button>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "App",
  methods: {
    addTodo(e) {
      e.preventDefault();
      const todo = {
        text: document.querySelector("input.input-todo").value,
        completed: false,
      };
      this.todos.push(todo);
    },
    completeTodo(index) {
      this.todos[index].completed = !this.todos[index].completed;
    },
    deleteTodo(index) {
      this.todos.splice(index, 1);
    },
  },
  data() {
    return {
      todos: [
        {
          text: "test-todo1",
          completed: false,
        },
        {
          text: "test-todo2",
          completed: true,
        },
        {
          text: "test-todo3",
          completed: false,
        },
      ],
    };
  },
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
