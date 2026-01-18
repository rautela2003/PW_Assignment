const request = require("supertest");
const app = require("../../src/app");

describe("Users Integration Test", () => {
  it(
    "creates and fetches users",
    async () => {
      await request(app)
        .post("/users")
        .send({ name: "Test User" })
        .expect(201);

      const response = await request(app).get("/users");

      expect(Array.isArray(response.body)).toBe(true);
      expect(response.body.length).toBeGreaterThan(0);
    },
    10000 // timeout for integration test
  );
});
